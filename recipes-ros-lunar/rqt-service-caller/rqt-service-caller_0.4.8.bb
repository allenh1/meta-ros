# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_service_caller provides a GUI plugin for calling arbitrary services."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin python-rospkg rosservice rqt-gui rqt-gui-py rqt-py-common"
SRC_URI = "https://github.com/ros-gbp/rqt_service_caller-release/archive/release/lunar/rqt_service_caller/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9929492c233efbc412e51f66a665d232"
SRC_URI[sha256sum] = "18fcd20687fcba12fd639a3c35c4717d2198116bf6c27bc0c0c1d94c1904b5b6"
S = "${WORKDIR}/rqt_service_caller-release-release-lunar-rqt_service_caller-0.4.8-0"

inherit catkin
