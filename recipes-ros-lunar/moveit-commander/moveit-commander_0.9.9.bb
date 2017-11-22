# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python interfaces to MoveIt"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin geometry-msgs moveit-msgs moveit-ros-planning-interface python python-catkin-pkg python-pyassimp rospy sensor-msgs shape-msgs tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_commander/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3578e75872f06eab178f261f885eec48"
SRC_URI[sha256sum] = "273330b1a210b4f8d2f114ba84d8632c2e63c0061b438e42409d515f08294023"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_commander-0.9.9-0"

inherit catkin
