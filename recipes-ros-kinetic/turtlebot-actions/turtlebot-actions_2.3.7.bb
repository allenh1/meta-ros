# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "turtlebot_actions provides several basic actionlib actions for the TurtleBot."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native cmake-modules cv-bridge eigen geometry-msgs image-geometry image-transport message-generation message-runtime roscpp tf turtlebot-bringup"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_apps-release/archive/release/kinetic/turtlebot_actions/2.3.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0410671a3945709adeac6dbff62aea9e"
SRC_URI[sha256sum] = "21c14463f4401f75e2bf220cac6211a6de31808dc0d235cfbf07995ea42b951f"
S = "${WORKDIR}/turtlebot_apps-release-release-kinetic-turtlebot_actions-2.3.7-0"

inherit catkin
