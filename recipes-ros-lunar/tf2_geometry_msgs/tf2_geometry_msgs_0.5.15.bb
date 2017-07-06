# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin geometry_msgs orocos_kdl python_orocos_kdl tf2 tf2_ros"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_geometry_msgs/0.5.15-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "46b2a83cb929f1702709174ce6199f23"
SRC_URI[sha256sum] = "3325155ee6a75f75777c24b99f277f187c435d257211a1e158e051f0e7fc6dd6"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
