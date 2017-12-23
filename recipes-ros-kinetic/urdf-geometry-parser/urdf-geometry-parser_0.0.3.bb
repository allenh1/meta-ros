# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extract geometry value of a vehicle from urdf"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp tf2 urdf"
SRC_URI = "https://github.com/ros-gbp/urdf_geometry_parser-release/archive/release/kinetic/urdf_geometry_parser/0.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eada60e98c7df3e775ecc15516e975d9"
SRC_URI[sha256sum] = "df59d7a59fda9b319985dc04e146a6dfad289c54bf8898b12a4988b2bd83835b"
S = "${WORKDIR}/urdf_geometry_parser-release-release-kinetic-urdf_geometry_parser-0.0.3-0"

inherit catkin
