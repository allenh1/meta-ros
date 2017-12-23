# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Open source libraries that will enable the Kinect to be used with Windows, Linux"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native cmake glut libusb-1.0-dev libxi-dev libxmu-dev"
SRC_URI = "https://github.com/ros-drivers-gbp/${PN}-ros-release/archive/release/kinetic/${PN}/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e5ed47135bd62e2d20ec6cfae459dc6f"
SRC_URI[sha256sum] = "c1523f04c9e92d69fe6bf05189a87b74f2b1db907aee16c7fe38d87b7e45457a"
S = "${WORKDIR}/${PN}-ros-release-release-kinetic-${PN}-0.5.1-0"

inherit catkin
