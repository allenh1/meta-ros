# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Assorted shell commands for using ros with bash."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/rosbash/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7052cd504d98efe975a8de9622f63688"
SRC_URI[sha256sum] = "cb34fcd89d1cd0006408590c7a2adfa6a7d5b71ccb2ca8cd8d7a92b961d7b2c2"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
