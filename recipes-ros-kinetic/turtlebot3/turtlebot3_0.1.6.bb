# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS packages for the Turtlebot3 (meta package)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native turtlebot3-bringup turtlebot3-description turtlebot3-navigation turtlebot3-slam turtlebot3-teleop"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/${PN}-release/archive/release/kinetic/${PN}/0.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b4bcfa90097cc9f32c4dfbda005ad44e"
SRC_URI[sha256sum] = "b666195fcdd9774a57ea54192e594da9ec0e5875e04ee6da3a113f1148e398b5"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.1.6-0"

inherit catkin
