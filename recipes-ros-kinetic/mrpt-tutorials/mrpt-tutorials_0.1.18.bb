# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Example files used as tutorials for MRPT ROS packages"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native teleop-twist-keyboard tf"
SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/kinetic/mrpt_tutorials/0.1.18-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5c08d7b54627526e578e94032faa482f"
SRC_URI[sha256sum] = "d331541de05d24d3daadc7a488c25341280783e2e8494e89a9016d0078acb71f"
S = "${WORKDIR}/mrpt_navigation-release-release-kinetic-mrpt_tutorials-0.1.18-0"

inherit catkin
