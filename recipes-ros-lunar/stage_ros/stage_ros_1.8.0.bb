# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "boost catkin geometry_msgs nav_msgs roscpp rostest sensor_msgs stage std_msgs std_srvs tf"
SRC_URI = "https://github.com/ros-gbp/stage_ros-release/archive/release/lunar/stage_ros/1.8.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4d4ce24144da42565ecd645df3999403"
SRC_URI[sha256sum] = "01b33012f5130a01635991e691effa5df4f70a144e4f4edcc652531e8cb0ef22"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
