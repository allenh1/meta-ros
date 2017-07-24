# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A teleoperation node for the p2os_driver package."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin geometry-msgs sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/lunar/p2os_teleop/2.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7ad521ae8d3fe3ea3d6f0497f17667d9"
SRC_URI[sha256sum] = "aa863aba17d3128093def4824a8ecd3defc96efad2414d95ddfda0be126675a5"
S = "${WORKDIR}/p2os-release-release-lunar-p2os_teleop-2.0.7-0"

inherit catkin
