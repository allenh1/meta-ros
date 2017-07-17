# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=cc7a7fc8d1d4325fd3bb9112e7244327"

DEPENDS = "angles catkin eigen_conversions kdl_conversions tf tf_conversions"
SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/lunar/geometry/1.11.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b52b40de57f4ef37d1aded830baf9475"
SRC_URI[sha256sum] = "5cf136d087facac2aadb2762084d398740d762638e55834c0153cbafad52c17c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
