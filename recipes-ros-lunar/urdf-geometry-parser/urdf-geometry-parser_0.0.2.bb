# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extract geometry value of a vehicle from urdf"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native roscpp tf2 urdf"
SRC_URI = "https://github.com/ros-gbp/urdf_geometry_parser-release/archive/release/lunar/urdf_geometry_parser/0.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "45d1657f70342e369832e5b1a49ccd8d"
SRC_URI[sha256sum] = "fbad2d778fbff0a071d529caadf5631eb3a5946f0de9aecccdcbd7303d6be999"
S = "${WORKDIR}/urdf_geometry_parser-release-release-lunar-urdf_geometry_parser-0.0.2-0"

inherit catkin
