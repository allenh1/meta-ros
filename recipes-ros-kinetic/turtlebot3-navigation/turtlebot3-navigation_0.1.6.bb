# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The turtlebot3_navigation package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "amcl catkin-native map-server move-base"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/kinetic/turtlebot3_navigation/0.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "24df8f299b41421dc241710d0d2e9f29"
SRC_URI[sha256sum] = "955ae62e56c311cab6b6319b77ccfc736e502aae50046554bcdcdbf07c903df5"
S = "${WORKDIR}/turtlebot3-release-release-kinetic-turtlebot3_navigation-0.1.6-0"

inherit catkin
