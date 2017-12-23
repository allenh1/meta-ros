# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interactive control for the TurtleBot using RViz and interactive markers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native interactive-markers roscpp turtlebot-bringup visualization-msgs"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_interactions-release/archive/release/kinetic/turtlebot_interactive_markers/2.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "88b16d6cc9e7141ee4d5adcd6dc31991"
SRC_URI[sha256sum] = "f17cda78e7b855b25d058aab4cf8a6afff1daf9fd9b3dbe5ab61951bedcabfc6"
S = "${WORKDIR}/turtlebot_interactions-release-release-kinetic-turtlebot_interactive_markers-2.3.1-0"

inherit catkin
