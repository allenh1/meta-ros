# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tests for MAVROS package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSDGPLv3LGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=826658bba7c4430e898ace6f2d3ff9b9"

DEPENDS = "angles catkin cmake_modules control_toolbox eigen eigen_conversions geometry_msgs mavros mavros_extras roscpp std_msgs tf2_ros"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/test_mavros/0.19.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6b97c44dbc05a11ea5b31d219b5f22f4"
SRC_URI[sha256sum] = "859008c5e8fa64d131bd35dfe73a5511e7fbad57ab3373b880ffbebfa02d3c0d"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
