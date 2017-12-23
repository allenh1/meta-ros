# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of how to use the xpp framework."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rosbag roscpp xpp-hyq xpp-quadrotor xpp-vis"
SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/kinetic/xpp_examples/1.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6c61c38be21ba49e2991d77c7515c6e5"
SRC_URI[sha256sum] = "a5a521381c1f5f87ad497a3c49338a5a450b11fe5d3ad573f07d0f0ad04df511"
S = "${WORKDIR}/xpp-release-release-kinetic-xpp_examples-1.0.3-0"

inherit catkin
