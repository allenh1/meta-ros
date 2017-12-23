# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A Python GUI plugin for introspecting available ROS message types.   Note that t"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rosmsg rospy rqt-gui rqt-gui-py rqt-msg"
SRC_URI = "https://github.com/ros-gbp/rqt_srv-release/archive/release/kinetic/rqt_srv/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b9bca34b71b4b72dd65cf3903fd237e9"
SRC_URI[sha256sum] = "cb789c7d969ed56335b19a75ca8d20918953ed5bbb1a3f978b593b0900f7e6b9"
S = "${WORKDIR}/rqt_srv-release-release-kinetic-rqt_srv-0.4.8-0"

inherit catkin
