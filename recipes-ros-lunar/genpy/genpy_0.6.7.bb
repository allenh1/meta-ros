# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python ROS message and service generators."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin genmsg python-pyyaml"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b4f58aed005f5e7d6fea40fec97424bb"
SRC_URI[sha256sum] = "66779fdc019ccb931dc620dbc6b1eaaaac1c8b7251826dbe06441eb6d5536b26"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-0.6.7-0"

inherit catkin
