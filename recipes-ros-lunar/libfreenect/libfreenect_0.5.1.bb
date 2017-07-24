# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Open source libraries that will enable the Kinect to be used with Windows, Linux"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "python-empy-native cmake glut libusb-1.0-dev libxi-dev libxmu-dev"
SRC_URI = "https://github.com/ros-drivers-gbp/libfreenect-ros-release/archive/release/lunar/libfreenect/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "be711f22897070ad071c9aa71193cd20"
SRC_URI[sha256sum] = "17c4ff968d8fae448ad1611859ea8663d63d6213c575720be5d307447fab6288"
S = "${WORKDIR}/libfreenect-ros-release-release-lunar-libfreenect-0.5.1-0"

inherit catkin
