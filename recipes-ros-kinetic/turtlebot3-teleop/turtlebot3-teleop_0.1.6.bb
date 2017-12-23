# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides teleoperation using keyboard for TurtleBot3."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs rospy"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/kinetic/turtlebot3_teleop/0.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "93e43d29b82b7cc29a36c22fc47fb3c3"
SRC_URI[sha256sum] = "2d4634ea72e6c9a1a0070c67f99b13ad0d697394570ca10921a6edc35577a059"
S = "${WORKDIR}/turtlebot3-release-release-kinetic-turtlebot3_teleop-0.1.6-0"

inherit catkin
