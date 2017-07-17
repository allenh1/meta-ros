# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the description (mechanical, kinematic, visual,
  etc.) of"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=8f4d2fc063d93def11cf11e6bd422333"

DEPENDS = "catkin convex_decomposition ivcon xacro"
SRC_URI = "https://github.com/ros-gbp/pr2_common-release/archive/release/lunar/pr2_description/1.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a50ace20e500f33307f03b8d460d288c"
SRC_URI[sha256sum] = "db10272a398d66a53da3b3d80dda6dd69bd59394c977461cc5c88bfc36c7652a"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
