# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS communications-related packages, including core client libraries (roscpp, ro"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-filters ros rosbag rosconsole roscpp rosgraph rosgraph-msgs roslaunch roslisp rosmaster rosmsg rosnode rosout rosparam rospy rosservice rostest rostopic roswtf std-srvs topic-tools xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/kinetic/ros_comm/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a9e323d02feaf50380fda1eeb6a06fc7"
SRC_URI[sha256sum] = "2892ef60ddea42dd62d2e765edab0c40f31290dedcab1e46a7366f0de9f8049b"
S = "${WORKDIR}/ros_comm-release-release-kinetic-ros_comm-1.12.12-0"

inherit catkin
