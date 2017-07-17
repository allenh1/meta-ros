# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Conversion functions between KDL and geometry_msgs types."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin geometry_msgs orocos_kdl"
SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/lunar/kdl_conversions/1.11.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cc827de15e382afe0928e4b4a1ef3f60"
SRC_URI[sha256sum] = "5615e6f50ae396f2c886e3bf74e6eb714ed4b2762ed44d4e5c642a0d88db8c7d"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
