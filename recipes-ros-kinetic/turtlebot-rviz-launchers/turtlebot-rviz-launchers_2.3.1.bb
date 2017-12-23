# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launchers for visualizing TurtleBot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native joint-state-publisher rviz turtlebot-bringup turtlebot-teleop"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_interactions-release/archive/release/kinetic/turtlebot_rviz_launchers/2.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bff29c5417e9f5f82796a404098aeb8e"
SRC_URI[sha256sum] = "2689dc90d9b07bc2d4d95ff71c6bce32169f9fe12f0957d1f1a0cf0322a01747"
S = "${WORKDIR}/turtlebot_interactions-release-release-kinetic-turtlebot_rviz_launchers-2.3.1-0"

inherit catkin
