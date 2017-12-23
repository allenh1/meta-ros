# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A pure-python interaface to the MoveIt! ROS API."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native geometry-msgs moveit-msgs python-pyassimp rospy shape-msgs tf"
SRC_URI = "https://github.com/mikeferguson/moveit_python-release/archive/release/kinetic/moveit_python/0.2.17-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5c741db17453cb9029de951cba936c9c"
SRC_URI[sha256sum] = "b9445b4fdc34560a82f846098f4c574f9fadf098a3339d58906954591feb1c3f"
S = "${WORKDIR}/moveit_python-release-release-kinetic-moveit_python-0.2.17-1"

inherit catkin
