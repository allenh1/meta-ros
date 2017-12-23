# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "turtlebot_navigation"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "amcl catkin-native dwa-local-planner gmapping map-server move-base roscpp sensor-msgs tf turtlebot-bringup"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_apps-release/archive/release/kinetic/turtlebot_navigation/2.3.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b97ed75de4b4562ad2d7d1b9cd0f43ad"
SRC_URI[sha256sum] = "cb54ee1f436869882dc973dc496e4506cf0987e01772d2b7769347c7c7a25101"
S = "${WORKDIR}/turtlebot_apps-release-release-kinetic-turtlebot_navigation-2.3.7-0"

inherit catkin
