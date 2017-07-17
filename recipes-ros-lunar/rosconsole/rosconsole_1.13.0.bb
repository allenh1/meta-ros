# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS console output library."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=70d3360a0f075d393c8822e14da87b85"

DEPENDS = "apr boost catkin cpp_common log4cxx rosbuild rostime rosunit"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rosconsole/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "28df463235b595152729e9628fd08876"
SRC_URI[sha256sum] = "7b75f1655d4cd295b9856d6756847dd0eb0200bdf5276700186301bcb360ddec"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
