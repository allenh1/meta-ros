# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "URDF file descriptions for P2OS/ARCOS robot"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin geometry-msgs kdl-parser p2os-driver p2os-msgs sensor-msgs std-msgs tf urdf"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/lunar/p2os_urdf/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5cadd51897d99ac3184d0aeafabc7f6f"
SRC_URI[sha256sum] = "b712b236a3329fbfb8ada7feb104a64996eadcccaf3a386c3d40b4a658e58277"
S = "${WORKDIR}/p2os-release-release-lunar-p2os_urdf-2.1.0-0"

inherit catkin
