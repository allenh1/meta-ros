# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Capabilities for the TurtleBot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "capabilities catkin-native std-capabilities"
SRC_URI = "https://github.com/turtlebot-release/turtlebot-release/archive/release/kinetic/turtlebot_capabilities/2.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f1285c8e824f7c647f184aca58d7f280"
SRC_URI[sha256sum] = "f3108f7b2a3eac6010e039753063e73c8cd8d758f5670a58bbf33b8b4ffa1d44"
S = "${WORKDIR}/turtlebot-release-release-kinetic-turtlebot_capabilities-2.4.2-0"

inherit catkin
