# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Standalone Python library for generating ROS message and service data structures"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=a2123803591ad7bbf3127c3255ee6c68"

DEPENDS = "catkin"
SRC_URI = "https://github.com/ros-gbp/genmsg-release/archive/release/lunar/genmsg/0.5.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4eeaa26389f8ef73700233d325f649f7"
SRC_URI[sha256sum] = "32f4892f1abc271c06a5a7e5965ecaeaeec776569e5c156134e1523921a160d6"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
