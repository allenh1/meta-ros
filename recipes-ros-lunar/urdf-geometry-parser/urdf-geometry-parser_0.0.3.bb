# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extract geometry value of a vehicle from urdf"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp tf2 urdf"
SRC_URI = "https://github.com/ros-gbp/urdf_geometry_parser-release/archive/release/lunar/urdf_geometry_parser/0.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e34f0871f4033e9cb8fa8fdd292f1928"
SRC_URI[sha256sum] = "337567663e097c1e382bfcc6f243936c995085b10e7d51eb970f2168ad0af4a2"
S = "${WORKDIR}/urdf_geometry_parser-release-release-lunar-urdf_geometry_parser-0.0.3-0"

inherit catkin
