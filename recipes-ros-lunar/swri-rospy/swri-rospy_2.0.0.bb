# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides added functionaliy on top of rospy, including a   single-t"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin rospy std-msgs std-srvs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_rospy/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9f8f0bc1dfe287f9b531e7c2edb158f0"
SRC_URI[sha256sum] = "feff3a5b7351e164a0164be36d588a2555839f690c2b9db49632a7b8108f24b1"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_rospy-2.0.0-0"

inherit catkin
