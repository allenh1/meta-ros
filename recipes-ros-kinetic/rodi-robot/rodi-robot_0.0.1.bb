# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "RoDI ROS package.     Allows to control a RoDI from the Robot Operating System ("
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs roslint rospy sensor-msgs"
SRC_URI = "https://github.com/benjayah/rodi_robot-release/archive/release/kinetic/rodi_robot/0.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e48c906edcd3b68d566aed80d9a3f42e"
SRC_URI[sha256sum] = "e3eaaad3b8c4551b9d5e5514c06f457f7a15bb15d0eda26338e90df72f0d3618"
S = "${WORKDIR}/rodi_robot-release-release-kinetic-rodi_robot-0.0.1-0"

inherit catkin
