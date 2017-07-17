# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Integration test suite based on roslaunch that is compatible with xUnit framewor"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=cd2ff4b4c1e8b423d4714099a6f7e7d3"

DEPENDS = "boost catkin rosgraph roslaunch rosmaster rospy rosunit"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rostest/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4ee8ff80f78a77fe13620b3658c34647"
SRC_URI[sha256sum] = "9bd208b6c9937f0cd3b812ba6a4a3323e330ef66220ffc7a01a393e6e5c92bad"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
