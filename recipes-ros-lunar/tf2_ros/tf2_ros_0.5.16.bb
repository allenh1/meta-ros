# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the ROS bindings for the tf2 library, for both Python and "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=a8d579c46d41b2a2cd142c96f98a745d"

DEPENDS = "actionlib actionlib_msgs catkin geometry_msgs message_filters roscpp rosgraph rospy std_msgs tf2 tf2_msgs tf2_py xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_ros/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c146aa618dbd11115cf0953c04fa59bf"
SRC_URI[sha256sum] = "f229904916fe1848559513e3c5ba32755f9132d11604f384c2441ee6348ac9d7"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
