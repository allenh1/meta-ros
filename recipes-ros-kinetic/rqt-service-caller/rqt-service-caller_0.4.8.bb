# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_service_caller provides a GUI plugin for calling arbitrary services."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg rosservice rqt-gui rqt-gui-py rqt-py-common"
SRC_URI = "https://github.com/ros-gbp/rqt_service_caller-release/archive/release/kinetic/rqt_service_caller/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "88775815ec016d4bed0a7ec188aa3bb4"
SRC_URI[sha256sum] = "61657a9e4a20a6684ffcde345832afc8603bb74c7aedb8cb2079c8a30cb48bf0"
S = "${WORKDIR}/rqt_service_caller-release-release-kinetic-rqt_service_caller-0.4.8-0"

inherit catkin
