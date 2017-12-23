# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Message and service types: custom messages and services for TurtleBot3 packages"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native message-generation message-runtime sensor-msgs std-msgs std-srvs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_msgs-release/archive/release/kinetic/turtlebot3_msgs/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6ff700da4592b01eb327c4eeb6873ed0"
SRC_URI[sha256sum] = "6e57452fb06afea48354af2a970a2302c43b65be4a8898dd1f4d25a91d56bb31"
S = "${WORKDIR}/turtlebot3_msgs-release-release-kinetic-turtlebot3_msgs-0.1.3-0"

inherit catkin
