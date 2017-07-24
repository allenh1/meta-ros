# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "URDF file descriptions for P2OS/ARCOS robot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native geometry-msgs kdl-parser sensor-msgs std-msgs tf urdf"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/lunar/p2os_urdf/2.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "68507acebb5f3b1f86c87104a7293e91"
SRC_URI[sha256sum] = "36eb6aa9fcc59eaa985c27a88d747929de863af561c1c418575c2bf2505b525f"
S = "${WORKDIR}/p2os-release-release-lunar-p2os_urdf-2.0.7-0"

inherit catkin
