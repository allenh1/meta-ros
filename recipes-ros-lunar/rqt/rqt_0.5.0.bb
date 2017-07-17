# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt is a Qt-based framework for GUI development for ROS. It consists of three pa"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=eb702fef9ffeeaf15f95cdba1e00247c"

DEPENDS = "catkin rqt_gui rqt_gui_cpp rqt_gui_py"
SRC_URI = "https://github.com/ros-gbp/rqt-release/archive/release/lunar/rqt/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d5d04ed1e5b8e257ef11e0099e936800"
SRC_URI[sha256sum] = "d295a1f05048518e7d55b15d6877d414003915b65c70eb53a45ac418235c4a53"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
