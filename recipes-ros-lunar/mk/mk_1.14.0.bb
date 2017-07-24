# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A collection of .mk include files for building ROS architectural elements.     M"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin rosbuild"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/mk/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "570425fd293b51223faa4caa1bcb1b03"
SRC_URI[sha256sum] = "1486bbb23f7addd2cce0a10bb52aacd9a1dc4e53417913756b2bac473dfbaff0"
S = "${WORKDIR}/ros-release-release-lunar-mk-1.14.0-0"

inherit catkin
