# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python interfaces to MoveIt"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs moveit-msgs moveit-ros-planning-interface python python-catkin-pkg-native python-pyassimp rospy sensor-msgs shape-msgs tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_commander/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ffd9d32c9a4c373321e8080be3d0b6ab"
SRC_URI[sha256sum] = "d699794f183a76b58ed4d263aa78a2c6c8f1a51f97b8142a81249de724fe6883"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_commander-0.9.10-0"

inherit catkin
