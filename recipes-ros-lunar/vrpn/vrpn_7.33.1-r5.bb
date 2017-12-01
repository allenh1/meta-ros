# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The VRPN is a library and set of servers that interfaces with virtual-reality sy"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSL1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1c7945be8716a98e36e855a20dc9b844"

DEPENDS = "catkin-native cmake"
SRC_URI = "https://github.com/ros-drivers-gbp/vrpn-release/archive/release/lunar/vrpn/7.33.1-5.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "92b62682b8febe4b02587d7c2fe12ca6"
SRC_URI[sha256sum] = "303d71e5610c312fc0715a180a0e05e24f77cb4282c1775642a54065fe6e6bf6"
S = "${WORKDIR}/vrpn-release-release-lunar-vrpn-7.33.1-5"

inherit catkin
