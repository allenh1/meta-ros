# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ros_tutorials contains packages that demonstrate various features of ROS,     as"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin roscpp-tutorials rospy-tutorials turtlesim"
SRC_URI = "https://github.com/ros-gbp/ros_tutorials-release/archive/release/lunar/ros_tutorials/0.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "caeec6c6a1c8489c703ff982fdb7816c"
SRC_URI[sha256sum] = "e8606d09ad282f199c5e8725646a09c73711678af728abc631fa8c7ac091edf3"
S = "${WORKDIR}/ros_tutorials-release-release-lunar-ros_tutorials-0.8.1-0"

inherit catkin
