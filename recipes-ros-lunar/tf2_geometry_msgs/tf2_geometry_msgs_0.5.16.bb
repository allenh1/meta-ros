# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_geometry_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=d38d0f5d29be633605ffc2fc46965323"

DEPENDS = "catkin geometry_msgs orocos_kdl python_orocos_kdl tf2 tf2_ros"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_geometry_msgs/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "23341e9d78cdf6396d3e3413eaa3e5fc"
SRC_URI[sha256sum] = "b391aa086528e0b2184243cbc158d32423593d9bb180d94cce070d1cec1ae88d"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
