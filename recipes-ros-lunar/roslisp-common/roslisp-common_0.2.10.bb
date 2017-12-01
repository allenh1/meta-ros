# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common libraries to control ROS based robots. This stack contains     an impleme"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-lisp catkin-native cl-tf cl-tf2 cl-transforms cl-transforms-stamped cl-urdf cl-utils roslisp-utilities"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/lunar/roslisp_common/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "07b5216e6e059a6f625e7c8469cd465f"
SRC_URI[sha256sum] = "0c83afcc275fc5be553347e4a5e573bf8dc7dd464cccc7508fe9e9a5fe4d2fa5"
S = "${WORKDIR}/roslisp_common-release-release-lunar-roslisp_common-0.2.10-0"

inherit catkin
