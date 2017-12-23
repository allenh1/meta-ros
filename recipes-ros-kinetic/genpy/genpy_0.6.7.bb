# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python ROS message and service generators."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genmsg python-pyyaml"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "926f7abe91b5998f2f51268b1b53adc7"
SRC_URI[sha256sum] = "6da14e4bd43b284e08490dba88f78af807d21f7b3e1aa06e4691e5124f2f77ec"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.6.7-0"

inherit catkin
