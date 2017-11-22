# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A teleoperation node for the p2os_driver package."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin geometry-msgs message-runtime sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/lunar/p2os_teleop/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dafd5e6cb72335dbbaeb997ed50474c1"
SRC_URI[sha256sum] = "0077632fd8b4d488f1e8fee14d69eda0c6eda2f6e57abe93ffb758d447ede8c9"
S = "${WORKDIR}/p2os-release-release-lunar-p2os_teleop-2.1.0-0"

inherit catkin
