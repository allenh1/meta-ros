# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python interfaces to MoveIt"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin geometry-msgs moveit-msgs moveit-ros-planning-interface python python-catkin-pkg-native python-pyassimp rospy sensor-msgs shape-msgs tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_commander/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "543ebdcb4346abb8b1962984697e5125"
SRC_URI[sha256sum] = "bb843ff58a44cea237eafb92846e806bdd9ac42c6ebe830ce0335e2935c540f5"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_commander-0.9.10-0"

inherit catkin
