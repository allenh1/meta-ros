# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The oros_tools_examples package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native oros-tools turtlebot turtlebot-navigation turtlebot-stage"
SRC_URI = "https://github.com/easymov/oros_tools_examples-release/archive/release/kinetic/oros_tools_examples/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1212d0b0509854a23c2e32e1978b82a4"
SRC_URI[sha256sum] = "ab9532b5b3b8436332230aaa226f6383ca3432ec5b1771861b42f4e66dbec2ef"
S = "${WORKDIR}/oros_tools_examples-release-release-kinetic-oros_tools_examples-0.1.3-0"

inherit catkin
