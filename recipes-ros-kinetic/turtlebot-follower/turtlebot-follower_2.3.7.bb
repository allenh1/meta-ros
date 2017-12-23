# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Follower for the turtlebot. Follows humans and robots around by following the ce"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native depth-image-proc dynamic-reconfigure nodelet roscpp topic-tools turtlebot-bringup turtlebot-msgs turtlebot-teleop visualization-msgs"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_apps-release/archive/release/kinetic/turtlebot_follower/2.3.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9e398077af2715afcb776426b7194119"
SRC_URI[sha256sum] = "8e66b61205ec0894fd9743f373afe7a8cc2a28859b322ad5698cf4c0a4341ff4"
S = "${WORKDIR}/turtlebot_apps-release-release-kinetic-turtlebot_follower-2.3.7-0"

inherit catkin
