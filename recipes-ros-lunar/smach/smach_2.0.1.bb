# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "SMACH is a task-level architecture for rapidly creating complex robot
    behavi"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=e3116ad8f4481e92908b6a6b1dc89725"

DEPENDS = "catkin"
SRC_URI = "https://github.com/ros-gbp/executive_smach-release/archive/release/lunar/smach/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f8376b095997d28cd1e282e50245c687"
SRC_URI[sha256sum] = "e7a93ed3ddff3328d636c30fe1095812535372c08ed9524e7726d749d8b47501"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
