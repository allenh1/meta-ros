# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The VRPN is a library and set of servers that interfaces with virtual-reality sy"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSL1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1c7945be8716a98e36e855a20dc9b844"

DEPENDS = "catkin cmake"
SRC_URI = "https://github.com/ros-drivers-gbp/vrpn-release/archive/release/lunar/vrpn/0.7.33-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "39b86dc4606f3ffe40ae7fc0265efaec"
SRC_URI[sha256sum] = "050c447f69899e483cbead82599ffd7d9e8ea7f2b5cc43d5986aa2a26978f3c7"
S = "${WORKDIR}/vrpn-release-release-lunar-vrpn-0.7.33-0"

inherit catkin
