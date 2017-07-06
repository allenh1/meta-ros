# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "actionlib actionlib_msgs catkin geometry_msgs message_filters roscpp rosgraph rospy std_msgs tf2 tf2_msgs tf2_py xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_ros/0.5.15-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4cbfa104eb9d3dd9ef06fc1ee03fe29c"
SRC_URI[sha256sum] = "36fa9ee0df5424cacec126d41283775b126b3f57a41cb8e37a4fb45bad9abcf3"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
