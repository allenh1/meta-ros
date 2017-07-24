# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python interfaces to MoveIt"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin geometry-msgs moveit-msgs moveit-ros-planning-interface python python-catkin-pkg python-pyassimp rospy sensor-msgs shape-msgs tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_commander/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fa1612403d41854707f44577a828742d"
SRC_URI[sha256sum] = "7f57b0ee137d1c525414519fe508daa86ef226ce5a3ff511c016e77189207504"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_commander-0.9.8-0"

inherit catkin
